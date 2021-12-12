diff --git a/h2o-core/src/main/java/hex/Model.java b/h2o-core/src/main/java/hex/Model.java
index 6dd0364..4042079 100755
--- a/h2o-core/src/main/java/hex/Model.java
+++ b/h2o-core/src/main/java/hex/Model.java
@@ -435,7 +435,7 @@
     }
     if( good == convNaN )
       throw new IllegalArgumentException("Validation set has no columns in common with the training set");
-    if( good == names.length || (colNameToSkip != null && test.find(colNameToSkip) == -1 && good == names.length - 1) )  // Only update if got something for all columns
+    if( good == names.length || (response != null && test.find(response) == -1 && good == names.length - 1) )  // Only update if got something for all columns
       test.restructure(names,vvecs,good);
     return msgs.toArray(new String[msgs.size()]);
   }
