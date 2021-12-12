diff --git a/core/java/android/view/ViewPropertyAnimator.java b/core/java/android/view/ViewPropertyAnimator.java
index 528eadd..71a85bc 100644
--- a/core/java/android/view/ViewPropertyAnimator.java
+++ b/core/java/android/view/ViewPropertyAnimator.java
@@ -838,7 +838,7 @@
         NameValuesHolder nameValuePair = new NameValuesHolder(constantName, startValue, byValue);
         mPendingAnimations.add(nameValuePair);
         mView.removeCallbacks(mAnimationStarter);
-        mView.post(mAnimationStarter);
+        mView.postOnAnimation(mAnimationStarter);
     }
 
     /**
