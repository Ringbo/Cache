diff --git a/htextview-library/src/main/java/com/hanks/htextview/HTextView.java b/htextview-library/src/main/java/com/hanks/htextview/HTextView.java
index a14dd1b..b7fd8a0 100644
--- a/htextview-library/src/main/java/com/hanks/htextview/HTextView.java
+++ b/htextview-library/src/main/java/com/hanks/htextview/HTextView.java
@@ -59,7 +59,7 @@
                 mIHText = new ScaleText();
                 break;
             case EVAPORATE:
-                mIHText = new EvaporateTlext();
+                mIHText = new EvaporateText();
                 break;
             case FALL:
                 mIHText = new FallText();
