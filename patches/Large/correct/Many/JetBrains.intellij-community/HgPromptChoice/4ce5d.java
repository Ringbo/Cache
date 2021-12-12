diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/execution/HgPromptChoice.java b/plugins/hg4idea/src/org/zmlx/hg4idea/execution/HgPromptChoice.java
index 2291528..e053296 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/execution/HgPromptChoice.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/execution/HgPromptChoice.java
@@ -41,7 +41,7 @@
 
   @Override
   public boolean equals(Object o) {
-    if (null == o) return true;
+    if (null == o) return false;
     if (getClass() != o.getClass()) return false;
 
     HgPromptChoice choice = (HgPromptChoice)o;
