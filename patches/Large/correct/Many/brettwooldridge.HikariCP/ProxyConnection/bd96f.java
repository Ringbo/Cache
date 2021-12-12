diff --git a/src/main/java/com/zaxxer/hikari/pool/ProxyConnection.java b/src/main/java/com/zaxxer/hikari/pool/ProxyConnection.java
index ea44484..b4fb824 100644
--- a/src/main/java/com/zaxxer/hikari/pool/ProxyConnection.java
+++ b/src/main/java/com/zaxxer/hikari/pool/ProxyConnection.java
@@ -162,7 +162,7 @@
       return sqle;
    }
 
-   final void untrackStatement(final Statement statement)
+   final synchronized void untrackStatement(final Statement statement)
    {
       openStatements.remove(statement);
    }
