diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/activities/DebugLogs.java b/app/src/main/java/com/SecUpwN/AIMSICD/activities/DebugLogs.java
index 3680226..98332f6 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/activities/DebugLogs.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/activities/DebugLogs.java
@@ -77,7 +77,7 @@
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_debug_logs);
         // Show the Up button in the action bar.
-        getActionBar().setDisplayHomeAsUpEnabled(true);
+        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 
         logView = (TextView) findViewById(R.id.debug_log_view);
         btnClear = (Button) findViewById(R.id.btnClear);
