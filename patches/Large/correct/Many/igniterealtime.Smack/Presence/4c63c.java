diff --git a/smack-core/src/main/java/org/jivesoftware/smack/packet/Presence.java b/smack-core/src/main/java/org/jivesoftware/smack/packet/Presence.java
index af15fc6..88bee47 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/packet/Presence.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/packet/Presence.java
@@ -185,15 +185,15 @@
     }
 
     /**
-     * Sets the priority of the presence. The valid range is -128 through 128.
+     * Sets the priority of the presence. The valid range is -128 through 127.
      *
      * @param priority the priority of the presence.
      * @throws IllegalArgumentException if the priority is outside the valid range.
      */
     public void setPriority(int priority) {
-        if (priority < -128 || priority > 128) {
+        if (priority < -128 || priority > 127) {
             throw new IllegalArgumentException("Priority value " + priority +
-                    " is not valid. Valid range is -128 through 128.");
+                    " is not valid. Valid range is -128 through 127.");
         }
         this.priority = priority;
     }
