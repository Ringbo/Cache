diff --git a/src/share/classes/com/sun/btrace/comm/WireIO.java b/src/share/classes/com/sun/btrace/comm/WireIO.java
index 01c2360..be3197a 100755
--- a/src/share/classes/com/sun/btrace/comm/WireIO.java
+++ b/src/share/classes/com/sun/btrace/comm/WireIO.java
@@ -86,7 +86,7 @@
         return cmd;
     }
 
-    static void write(ObjectOutput out, Command cmd)
+    public static void write(ObjectOutput out, Command cmd)
             throws IOException {
         out.writeByte(cmd.getType());
         cmd.write(out);
