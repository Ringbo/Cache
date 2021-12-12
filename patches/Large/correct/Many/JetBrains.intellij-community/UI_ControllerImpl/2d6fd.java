diff --git a/plugins/git4idea/GitAlk/ui_controller/src/org/hanuna/gitalk/ui/impl/UI_ControllerImpl.java b/plugins/git4idea/GitAlk/ui_controller/src/org/hanuna/gitalk/ui/impl/UI_ControllerImpl.java
index 1b8774d..71d9a3c 100644
--- a/plugins/git4idea/GitAlk/ui_controller/src/org/hanuna/gitalk/ui/impl/UI_ControllerImpl.java
+++ b/plugins/git4idea/GitAlk/ui_controller/src/org/hanuna/gitalk/ui/impl/UI_ControllerImpl.java
@@ -509,7 +509,7 @@
     }
 
     public FakeCommitsInfo getFakeCommitsInfo() {
-      return new FakeCommitsInfo(fakeCommits, base, resultRef);
+      return new FakeCommitsInfo(fakeCommits, base, resultRef, subjectRef);
     }
   }
 
