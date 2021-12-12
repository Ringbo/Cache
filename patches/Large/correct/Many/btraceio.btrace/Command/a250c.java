diff --git a/src/share/classes/com/sun/btrace/comm/Command.java b/src/share/classes/com/sun/btrace/comm/Command.java
index 8937f8b..b9015d1 100755
--- a/src/share/classes/com/sun/btrace/comm/Command.java
+++ b/src/share/classes/com/sun/btrace/comm/Command.java
@@ -64,7 +64,7 @@
         return type;
     }
 
-    public final boolean isUrgent() {
+    final boolean isUrgent() {
         switch (type) {
             case MESSAGE:
             case NUMBER_MAP:
