diff --git a/plugins/git4idea/src/git4idea/util/GitUIUtil.java b/plugins/git4idea/src/git4idea/util/GitUIUtil.java
index b6c2558..5e56d2e 100644
--- a/plugins/git4idea/src/git4idea/util/GitUIUtil.java
+++ b/plugins/git4idea/src/git4idea/util/GitUIUtil.java
@@ -91,7 +91,7 @@
           }
         }
         else {
-          errorMessages.add(error.toString().replace("\n", "<br/>"));
+          errorMessages.add(error.getMessage().replace("\n", "<br/>"));
         }
       }
     }
