diff --git a/library/src/main/java/com/evernote/android/job/util/GcmAvailableHelper.java b/library/src/main/java/com/evernote/android/job/util/GcmAvailableHelper.java
index 9f3056e..0bd8d6b 100644
--- a/library/src/main/java/com/evernote/android/job/util/GcmAvailableHelper.java
+++ b/library/src/main/java/com/evernote/android/job/util/GcmAvailableHelper.java
@@ -40,9 +40,10 @@
             return GCM_IN_CLASSPATH
                     && GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == ConnectionResult.SUCCESS
                     && isGcmServiceRegistered(context) == ConnectionResult.SUCCESS;
-        } catch (Exception e) {
+        } catch (Throwable t) {
             // seeing sometimes a DeadObjectException, return false, we can't do anything in this case
-            Cat.w(e);
+            // still sometimes seeing a NoClassDefFoundError here
+            Cat.w(t);
             return false;
         }
     }
