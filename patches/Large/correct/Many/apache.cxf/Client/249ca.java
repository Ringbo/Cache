diff --git a/distribution/src/main/release/samples/ws_addressing/src/main/java/demo/ws_addressing/client/Client.java b/distribution/src/main/release/samples/ws_addressing/src/main/java/demo/ws_addressing/client/Client.java
index 45e6d28..88364dc 100644
--- a/distribution/src/main/release/samples/ws_addressing/src/main/java/demo/ws_addressing/client/Client.java
+++ b/distribution/src/main/release/samples/ws_addressing/src/main/java/demo/ws_addressing/client/Client.java
@@ -85,7 +85,7 @@
 
         } catch (UndeclaredThrowableException ex) {
             ex.getUndeclaredThrowable().printStackTrace();
-        } catch (Exception ex) {
+        } catch (Throwable ex) {
             ex.printStackTrace();
         }  finally {
             System.exit(0);
