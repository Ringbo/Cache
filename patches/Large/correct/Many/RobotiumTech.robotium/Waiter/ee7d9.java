diff --git a/robotium-solo/src/main/java/com/robotium/solo/Waiter.java b/robotium-solo/src/main/java/com/robotium/solo/Waiter.java
index e586be7..3760383 100644
--- a/robotium-solo/src/main/java/com/robotium/solo/Waiter.java
+++ b/robotium-solo/src/main/java/com/robotium/solo/Waiter.java
@@ -715,7 +715,7 @@
 				return activityUtils.getCurrentActivity().getFragmentManager().findFragmentById(id);
 			else
 				return activityUtils.getCurrentActivity().getFragmentManager().findFragmentByTag(tag);
-		}catch (Exception ignored) {}
+		}catch (Throwable ignored) {}
 
 		return null;
 	}
