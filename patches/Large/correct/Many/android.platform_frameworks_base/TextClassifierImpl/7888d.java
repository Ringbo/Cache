diff --git a/core/java/android/view/textclassifier/TextClassifierImpl.java b/core/java/android/view/textclassifier/TextClassifierImpl.java
index 6cf6b69..d7aaee7 100644
--- a/core/java/android/view/textclassifier/TextClassifierImpl.java
+++ b/core/java/android/view/textclassifier/TextClassifierImpl.java
@@ -382,7 +382,7 @@
         }
 
         final String type = getHighestScoringType(classifications);
-        addActions(builder, IntentFactory.create(mContext, type, text));
+        addActions(builder, IntentFactory.create(mContext, type, classifiedText));
 
         return builder.setSignature(getSignature(text, start, end)).build();
     }
