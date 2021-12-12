diff --git a/src/org/zaproxy/zap/extension/httpsessions/HttpSessionsPanel.java b/src/org/zaproxy/zap/extension/httpsessions/HttpSessionsPanel.java
index 6eb8eac..d8a0c22 100644
--- a/src/org/zaproxy/zap/extension/httpsessions/HttpSessionsPanel.java
+++ b/src/org/zaproxy/zap/extension/httpsessions/HttpSessionsPanel.java
@@ -94,7 +94,7 @@
 		this.setSize(474, 251);
 		this.setName(Constant.messages.getString("httpsessions.panel.title"));
 		this.setIcon(new ImageIcon(HttpSessionsPanel.class.getResource("/resource/icon/16/session.png")));
-		this.add(getPanelCommand());
+		this.add(getPanelCommand(), getPanelCommand().getName());
 	}
 
 	/**
