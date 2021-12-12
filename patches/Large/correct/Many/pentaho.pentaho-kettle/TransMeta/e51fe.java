diff --git a/src/be/ibridge/kettle/trans/TransMeta.java b/src/be/ibridge/kettle/trans/TransMeta.java
index 22f5b1b..f209b6a 100644
--- a/src/be/ibridge/kettle/trans/TransMeta.java
+++ b/src/be/ibridge/kettle/trans/TransMeta.java
@@ -5008,15 +5008,15 @@
         {
             Value arg = args.getValue(i);
             int argNr = Const.toInt(arg.getName(), -1);
-            if (arguments!=null && argNr >= 0 && argNr < arguments.length)
+            if (arguments!=null && argNr > 0 && argNr <= arguments.length)
             {
-                arg.setValue(arguments[argNr]);
+                arg.setValue(arguments[argNr-1]);
             }
             if (arg.isNull() || arg.getString() == null) // try the saved option...
             {
-                if (argNr >= 0 && argNr < saved.length && saved[argNr] != null)
+                if (argNr > 0 && argNr <= saved.length && saved[argNr] != null)
                 {
-                    arg.setValue(saved[argNr]);
+                    arg.setValue(saved[argNr-1]);
                 }
             }
             arg.setName("Argument " + arg.getName()); //$NON-NLS-1$
