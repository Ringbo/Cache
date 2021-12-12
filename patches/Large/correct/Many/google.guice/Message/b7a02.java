diff --git a/core/src/com/google/inject/spi/Message.java b/core/src/com/google/inject/spi/Message.java
index 3571ecd..14d3bcc 100644
--- a/core/src/com/google/inject/spi/Message.java
+++ b/core/src/com/google/inject/spi/Message.java
@@ -126,7 +126,7 @@
     for (int i = 0; i < sourcesAsStrings.length; i++) {
       sourcesAsStrings[i] = Errors.convert(sourcesAsStrings[i]).toString();
     }
-    return new Message(ImmutableList.of(sourcesAsStrings), message, cause);
+    return new Message(ImmutableList.copyOf(sourcesAsStrings), message, cause);
   }
 
   private static final long serialVersionUID = 0;
