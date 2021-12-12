diff --git a/app/src/main/java/eu/faircode/netguard/AdapterRule.java b/app/src/main/java/eu/faircode/netguard/AdapterRule.java
index ec7e3ba..bea7bc6 100644
--- a/app/src/main/java/eu/faircode/netguard/AdapterRule.java
+++ b/app/src/main/java/eu/faircode/netguard/AdapterRule.java
@@ -749,7 +749,7 @@
                                         rule.hosts = hosts;
                                         notifyDataSetChanged();
                                     }
-                                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
+                                }.execute();
 
                             return result;
                         }
