diff --git a/src/net/java/sip/communicator/util/swing/SIPCommFrame.java b/src/net/java/sip/communicator/util/swing/SIPCommFrame.java
index 3a7c856..fc8949b 100644
--- a/src/net/java/sip/communicator/util/swing/SIPCommFrame.java
+++ b/src/net/java/sip/communicator/util/swing/SIPCommFrame.java
@@ -192,7 +192,7 @@
         {
             saveSizeAndLocation(this);
         }
-        catch (ConfigPropertyVetoExceoption e)
+        catch (ConfigPropertyVetoException e)
         {
             logger
                 .error(
@@ -212,7 +212,7 @@
      * <tt>PropertyVetoListener</tt>s.
      */
     static void saveSizeAndLocation(Component component)
-        throws ConfigPropertyVetoExceoption
+        throws ConfigPropertyVetoException
     {
         Map<String, Object> props = new HashMap<String, Object>();
         String className
