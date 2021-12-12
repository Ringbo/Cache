diff --git a/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/socket/BioSocketChannel.java b/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/socket/BioSocketChannel.java
index 65b55ed..4a272fd 100644
--- a/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/socket/BioSocketChannel.java
+++ b/driver/src/main/java/com/alibaba/otter/canal/parse/driver/mysql/socket/BioSocketChannel.java
@@ -56,7 +56,7 @@
                 }
             } catch (SocketTimeoutException te) {
                 if (Thread.interrupted()) {
-                    throw new ClosedByInterruptException("Interrupted while reading.");
+                    throw new ClosedByInterruptException();
                 }
             }
         }
