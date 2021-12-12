diff --git a/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/impl/DefaultVirtualFrame.java b/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/impl/DefaultVirtualFrame.java
index 6a915f1..7917921 100644
--- a/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/impl/DefaultVirtualFrame.java
+++ b/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/impl/DefaultVirtualFrame.java
@@ -86,12 +86,12 @@
 
     @Override
     public boolean getBoolean(FrameSlot slot) {
-        return (Boolean) get(slot, Float.class, UNDEFINED_BOOLEAN);
+        return (Boolean) get(slot, Boolean.class, UNDEFINED_BOOLEAN);
     }
 
     @Override
     public void setBoolean(FrameSlot slot, boolean value) {
-        set(slot, Float.class, value);
+        set(slot, Boolean.class, value);
     }
 
     @Override
