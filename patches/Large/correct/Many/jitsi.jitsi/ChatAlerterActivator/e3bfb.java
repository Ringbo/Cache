diff --git a/src/net/java/sip/communicator/plugin/chatalerter/ChatAlerterActivator.java b/src/net/java/sip/communicator/plugin/chatalerter/ChatAlerterActivator.java
index a24d20e..6ad2ff6 100644
--- a/src/net/java/sip/communicator/plugin/chatalerter/ChatAlerterActivator.java
+++ b/src/net/java/sip/communicator/plugin/chatalerter/ChatAlerterActivator.java
@@ -299,7 +299,7 @@
 
             Alerter.newInstance().alert(fr);
         }
-        catch (Exception ex)
+        catch (Throwable ex)
         {
             logger.error("Cannot alert chat window!");
         }
