diff --git a/proxy/src/main/java/net/md_5/bungee/tab/TabList.java b/proxy/src/main/java/net/md_5/bungee/tab/TabList.java
index 7b59c75..00f57b2 100644
--- a/proxy/src/main/java/net/md_5/bungee/tab/TabList.java
+++ b/proxy/src/main/java/net/md_5/bungee/tab/TabList.java
@@ -36,7 +36,7 @@
             {
                 item.setUuid( player.getUniqueId() );
                 LoginResult loginResult = player.getPendingConnection().getLoginProfile();
-                if ( loginResult != null )
+                if ( loginResult != null && loginResult.getProperties() != null )
                 {
                     String[][] props = new String[ loginResult.getProperties().length ][];
                     for ( int i = 0; i < props.length; i++ )
