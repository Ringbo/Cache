diff --git a/app/src/main/java/xyz/monkeytong/hongbao/utils/HongbaoSignature.java b/app/src/main/java/xyz/monkeytong/hongbao/utils/HongbaoSignature.java
index 4d7e188..597dc0a 100644
--- a/app/src/main/java/xyz/monkeytong/hongbao/utils/HongbaoSignature.java
+++ b/app/src/main/java/xyz/monkeytong/hongbao/utils/HongbaoSignature.java
@@ -18,7 +18,7 @@
 
             /* The text in the hongbao. Should mean something. */
             String hongbaoContent = hongbaoNode.getChild(0).getText().toString();
-            if (hongbaoContent == null) return false;
+            if (hongbaoContent == null || "查看红包".equals(hongbaoContent)) return false;
 
             /* Check the user's exclude words list. */
             String[] excludeWordsArray = excludeWords.split(" +");
