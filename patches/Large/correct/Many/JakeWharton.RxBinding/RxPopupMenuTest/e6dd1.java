diff --git a/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxPopupMenuTest.java b/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxPopupMenuTest.java
index 269f817..1d64cdd 100644
--- a/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxPopupMenuTest.java
+++ b/rxbinding-appcompat-v7/src/androidTest/java/com/jakewharton/rxbinding2/support/v7/widget/RxPopupMenuTest.java
@@ -69,7 +69,7 @@
         view.dismiss();
       }
     });
-    assertThat(o.takeNext()).isNull();
+    assertThat(o.takeNext()).isNotNull();
 
     o.dispose();
     instrumentation.runOnMainSync(new Runnable() {
