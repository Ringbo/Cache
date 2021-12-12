diff --git a/cmds/am/src/com/android/commands/am/Am.java b/cmds/am/src/com/android/commands/am/Am.java
index d7bab41..54b62d8 100644
--- a/cmds/am/src/com/android/commands/am/Am.java
+++ b/cmds/am/src/com/android/commands/am/Am.java
@@ -551,7 +551,7 @@
                 String[] strings = value.split(",");
                 float[] list = new float[strings.length];
                 for (int i = 0; i < strings.length; i++) {
-                    list[i] = Float.valueOf(strings[i]);
+                    list[i] = Float.parseFloat(strings[i]);
                 }
                 intent.putExtra(key, list);
                 hasIntentInfo = true;
@@ -1873,7 +1873,7 @@
 
     private void runStackStart() throws Exception {
         String displayIdStr = nextArgRequired();
-        int displayId = Integer.valueOf(displayIdStr);
+        int displayId = Integer.parseInt(displayIdStr);
         Intent intent = makeIntent(UserHandle.USER_CURRENT);
 
         try {
@@ -1887,9 +1887,9 @@
 
     private void runStackMoveTask() throws Exception {
         String taskIdStr = nextArgRequired();
-        int taskId = Integer.valueOf(taskIdStr);
+        int taskId = Integer.parseInt(taskIdStr);
         String stackIdStr = nextArgRequired();
-        int stackId = Integer.valueOf(stackIdStr);
+        int stackId = Integer.parseInt(stackIdStr);
         String toTopStr = nextArgRequired();
         final boolean toTop;
         if ("true".equals(toTopStr)) {
@@ -1909,7 +1909,7 @@
 
     private void runStackResize() throws Exception {
         String stackIdStr = nextArgRequired();
-        int stackId = Integer.valueOf(stackIdStr);
+        int stackId = Integer.parseInt(stackIdStr);
         final Rect bounds = getBounds();
         if (bounds == null) {
             System.err.println("Error: invalid input bounds");
@@ -1935,7 +1935,7 @@
     private void runStackInfo() throws Exception {
         try {
             String stackIdStr = nextArgRequired();
-            int stackId = Integer.valueOf(stackIdStr);
+            int stackId = Integer.parseInt(stackIdStr);
             StackInfo info = mAm.getStackInfo(stackId);
             System.out.println(info);
         } catch (RemoteException e) {
@@ -1943,7 +1943,7 @@
     }
 
     private void runStackSplit() throws Exception {
-        final int stackId = Integer.valueOf(nextArgRequired());
+        final int stackId = Integer.parseInt(nextArgRequired());
         final String splitDirection = nextArgRequired();
         Intent intent = null;
         try {
@@ -2020,7 +2020,7 @@
             if (taskIdStr.equals("stop")) {
                 mAm.stopLockTaskMode();
             } else {
-                int taskId = Integer.valueOf(taskIdStr);
+                int taskId = Integer.parseInt(taskIdStr);
                 mAm.startLockTaskMode(taskId);
             }
             System.err.println("Activity manager is " + (mAm.isInLockTaskMode() ? "" : "not ") +
@@ -2031,9 +2031,9 @@
 
     private void runTaskResizeable() throws Exception {
         final String taskIdStr = nextArgRequired();
-        final int taskId = Integer.valueOf(taskIdStr);
+        final int taskId = Integer.parseInt(taskIdStr);
         final String resizeableStr = nextArgRequired();
-        final boolean resizeable = Boolean.valueOf(resizeableStr);
+        final boolean resizeable = Boolean.parseBoolean(resizeableStr);
 
         try {
             mAm.setTaskResizeable(taskId, resizeable);
@@ -2043,7 +2043,7 @@
 
     private void runTaskResize() throws Exception {
         final String taskIdStr = nextArgRequired();
-        final int taskId = Integer.valueOf(taskIdStr);
+        final int taskId = Integer.parseInt(taskIdStr);
         final Rect bounds = getBounds();
         if (bounds == null) {
             System.err.println("Error: invalid input bounds");
@@ -2245,13 +2245,13 @@
 
     private Rect getBounds() {
         String leftStr = nextArgRequired();
-        int left = Integer.valueOf(leftStr);
+        int left = Integer.parseInt(leftStr);
         String topStr = nextArgRequired();
-        int top = Integer.valueOf(topStr);
+        int top = Integer.parseInt(topStr);
         String rightStr = nextArgRequired();
-        int right = Integer.valueOf(rightStr);
+        int right = Integer.parseInt(rightStr);
         String bottomStr = nextArgRequired();
-        int bottom = Integer.valueOf(bottomStr);
+        int bottom = Integer.parseInt(bottomStr);
         if (left < 0) {
             System.err.println("Error: bad left arg: " + leftStr);
             return null;
