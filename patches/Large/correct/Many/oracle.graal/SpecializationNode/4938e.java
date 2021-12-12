diff --git a/truffle/com.oracle.truffle.api.dsl/src/com/oracle/truffle/api/dsl/internal/SpecializationNode.java b/truffle/com.oracle.truffle.api.dsl/src/com/oracle/truffle/api/dsl/internal/SpecializationNode.java
index e560a51..c694a9e 100644
--- a/truffle/com.oracle.truffle.api.dsl/src/com/oracle/truffle/api/dsl/internal/SpecializationNode.java
+++ b/truffle/com.oracle.truffle.api.dsl/src/com/oracle/truffle/api/dsl/internal/SpecializationNode.java
@@ -622,7 +622,7 @@
 
     private static final class InsertionEvent0 extends SlowPathEvent0 implements Callable<SpecializationNode> {
 
-        public InsertionEvent0(SpecializationNode source, String reason, Frame frame) {
+        InsertionEvent0(SpecializationNode source, String reason, Frame frame) {
             super(source, reason, frame);
         }
 
@@ -646,7 +646,7 @@
 
     private static final class InsertionEvent1 extends SlowPathEvent1 implements Callable<SpecializationNode> {
 
-        public InsertionEvent1(SpecializationNode source, String reason, Frame frame, Object o1) {
+        InsertionEvent1(SpecializationNode source, String reason, Frame frame, Object o1) {
             super(source, reason, frame, o1);
         }
 
@@ -670,7 +670,7 @@
 
     private static final class InsertionEvent2 extends SlowPathEvent2 implements Callable<SpecializationNode> {
 
-        public InsertionEvent2(SpecializationNode source, String reason, Frame frame, Object o1, Object o2) {
+        InsertionEvent2(SpecializationNode source, String reason, Frame frame, Object o1, Object o2) {
             super(source, reason, frame, o1, o2);
         }
 
@@ -694,7 +694,7 @@
 
     private static final class InsertionEvent3 extends SlowPathEvent3 implements Callable<SpecializationNode> {
 
-        public InsertionEvent3(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3) {
+        InsertionEvent3(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3) {
             super(source, reason, frame, o1, o2, o3);
         }
 
@@ -718,7 +718,7 @@
 
     private static final class InsertionEvent4 extends SlowPathEvent4 implements Callable<SpecializationNode> {
 
-        public InsertionEvent4(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4) {
+        InsertionEvent4(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4) {
             super(source, reason, frame, o1, o2, o3, o4);
         }
 
@@ -742,7 +742,7 @@
 
     private static final class InsertionEvent5 extends SlowPathEvent5 implements Callable<SpecializationNode> {
 
-        public InsertionEvent5(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4, Object o5) {
+        InsertionEvent5(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4, Object o5) {
             super(source, reason, frame, o1, o2, o3, o4, o5);
         }
 
@@ -766,7 +766,7 @@
 
     private static final class InsertionEventN extends SlowPathEventN implements Callable<SpecializationNode> {
 
-        public InsertionEventN(SpecializationNode source, String reason, Frame frame, Object[] args) {
+        InsertionEventN(SpecializationNode source, String reason, Frame frame, Object[] args) {
             super(source, reason, frame, args);
         }
 
@@ -789,7 +789,7 @@
 
     private static final class RemoveEvent0 extends SlowPathEvent0 implements Callable<SpecializationNode> {
 
-        public RemoveEvent0(SpecializationNode source, String reason, Frame frame) {
+        RemoveEvent0(SpecializationNode source, String reason, Frame frame) {
             super(source, reason, frame);
         }
 
@@ -801,7 +801,7 @@
 
     private static final class RemoveEvent1 extends SlowPathEvent1 implements Callable<SpecializationNode> {
 
-        public RemoveEvent1(SpecializationNode source, String reason, Frame frame, Object o1) {
+        RemoveEvent1(SpecializationNode source, String reason, Frame frame, Object o1) {
             super(source, reason, frame, o1);
         }
 
@@ -813,7 +813,7 @@
 
     private static final class RemoveEvent2 extends SlowPathEvent2 implements Callable<SpecializationNode> {
 
-        public RemoveEvent2(SpecializationNode source, String reason, Frame frame, Object o1, Object o2) {
+        RemoveEvent2(SpecializationNode source, String reason, Frame frame, Object o1, Object o2) {
             super(source, reason, frame, o1, o2);
         }
 
@@ -825,7 +825,7 @@
 
     private static final class RemoveEvent3 extends SlowPathEvent3 implements Callable<SpecializationNode> {
 
-        public RemoveEvent3(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3) {
+        RemoveEvent3(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3) {
             super(source, reason, frame, o1, o2, o3);
         }
 
@@ -837,7 +837,7 @@
 
     private static final class RemoveEvent4 extends SlowPathEvent4 implements Callable<SpecializationNode> {
 
-        public RemoveEvent4(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4) {
+        RemoveEvent4(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4) {
             super(source, reason, frame, o1, o2, o3, o4);
         }
 
@@ -849,7 +849,7 @@
 
     private static final class RemoveEvent5 extends SlowPathEvent5 implements Callable<SpecializationNode> {
 
-        public RemoveEvent5(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4, Object o5) {
+        RemoveEvent5(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4, Object o5) {
             super(source, reason, frame, o1, o2, o3, o4, o5);
         }
 
@@ -861,7 +861,7 @@
 
     private static final class RemoveEventN extends SlowPathEventN implements Callable<SpecializationNode> {
 
-        public RemoveEventN(SpecializationNode source, String reason, Frame frame, Object[] args) {
+        RemoveEventN(SpecializationNode source, String reason, Frame frame, Object[] args) {
             super(source, reason, frame, args);
         }
 
