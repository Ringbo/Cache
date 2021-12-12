diff --git a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/fragments/AtCommandFragment.java b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/fragments/AtCommandFragment.java
index c9962a0..8780ea4 100644
--- a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/fragments/AtCommandFragment.java
+++ b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/fragments/AtCommandFragment.java
@@ -104,10 +104,10 @@
     private AtCommandTerminal mCommandTerminal;
 
     @InjectView(R.id.timeout_spinner)
-    Spinner timeoutSpinner;
+    private Spinner timeoutSpinner;
 
     @InjectView(R.id.execute)
-    Button atCommandExecute;
+    private Button atCommandExecute;
 
     @Override
     public void onViewCreated(View view, Bundle savedInstanceState) {
