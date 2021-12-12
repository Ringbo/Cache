diff --git a/services/core/java/com/android/server/job/JobServiceContext.java b/services/core/java/com/android/server/job/JobServiceContext.java
index 5e495fa..fb54d3b 100644
--- a/services/core/java/com/android/server/job/JobServiceContext.java
+++ b/services/core/java/com/android/server/job/JobServiceContext.java
@@ -445,7 +445,10 @@
                 mVerb = VERB_STARTING;
                 scheduleOpTimeOut();
                 service.startJob(mParams);
-            } catch (RemoteException e) {
+            } catch (Exception e) {
+                // We catch 'Exception' because client-app malice or bugs might induce a wide
+                // range of possible exception-throw outcomes from startJob() and its handling
+                // of the client's ParcelableBundle extras.
                 Slog.e(TAG, "Error sending onStart message to '" +
                         mRunningJob.getServiceComponent().getShortClassName() + "' ", e);
             }
