diff --git a/servers/src/main/java/tachyon/worker/nio/NIODataServer.java b/servers/src/main/java/tachyon/worker/nio/NIODataServer.java
index 12340df..bf2c483 100644
--- a/servers/src/main/java/tachyon/worker/nio/NIODataServer.java
+++ b/servers/src/main/java/tachyon/worker/nio/NIODataServer.java
@@ -157,7 +157,7 @@
         socketSelector.close();
       } catch (IOException ex) {
         // ignore, we want the other exception
-        LOG.warn("Unable to close socket selector", ex);
+        LOG.warn("Unable to close socket selector");
       }
       throw e;
     } catch (RuntimeException e) {
@@ -167,7 +167,7 @@
         socketSelector.close();
       } catch (IOException ex) {
         // ignore, we want the other exception
-        LOG.warn("Unable to close socket selector", ex);
+        LOG.warn("Unable to close socket selector");
       }
       throw e;
     }
