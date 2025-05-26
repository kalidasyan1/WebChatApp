package com.example.chat;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
public class ChatWebSocketHandler extends TextWebSocketHandler {

  private final Set<WebSocketSession> sessions = new CopyOnWriteArraySet<>();

  @Override
  public void afterConnectionEstablished(WebSocketSession session) {
    sessions.add(session);
    System.out.println("Client connected: " + session.getId());
  }

  @Override
  public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    System.out.println("Received: " + message.getPayload());
    for (WebSocketSession s : sessions) {
      if (s.isOpen()) {
        s.sendMessage(message);
      }
    }
  }

  @Override
  public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
    sessions.remove(session);
    System.out.println("Client disconnected: " + session.getId());
  }
}
