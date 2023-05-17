package github.umer0586.sensorserver.websocketserver;

import org.java_websocket.WebSocket;

import java.util.ArrayList;

public interface ConnectionsChangeListener {
    void onConnectionsChanged(ArrayList<WebSocket> webSockets);
}