diff --git a/truffle/com.oracle.truffle.api.dsl/src/com/oracle/truffle/api/dsl/internal/SlowPathEvent.java b/truffle/com.oracle.truffle.api.dsl/src/com/oracle/truffle/api/dsl/internal/SlowPathEvent.java
index 5a3fcd9..2d43567 100644
--- a/truffle/com.oracle.truffle.api.dsl/src/com/oracle/truffle/api/dsl/internal/SlowPathEvent.java
+++ b/truffle/com.oracle.truffle.api.dsl/src/com/oracle/truffle/api/dsl/internal/SlowPathEvent.java
@@ -98,7 +98,7 @@
 
         private static final Object[] EMPTY = new Object[0];
 
-        public SlowPathEvent0(SpecializationNode source, String reason, Frame frame) {
+        SlowPathEvent0(SpecializationNode source, String reason, Frame frame) {
             super(source, reason, frame);
         }
 
@@ -113,7 +113,7 @@
 
         protected final Object o1;
 
-        public SlowPathEvent1(SpecializationNode source, String reason, Frame frame, Object o1) {
+        SlowPathEvent1(SpecializationNode source, String reason, Frame frame, Object o1) {
             super(source, reason, frame);
             this.o1 = o1;
         }
@@ -130,7 +130,7 @@
         protected final Object o1;
         protected final Object o2;
 
-        public SlowPathEvent2(SpecializationNode source, String reason, Frame frame, Object o1, Object o2) {
+        SlowPathEvent2(SpecializationNode source, String reason, Frame frame, Object o1, Object o2) {
             super(source, reason, frame);
             this.o1 = o1;
             this.o2 = o2;
@@ -149,7 +149,7 @@
         protected final Object o2;
         protected final Object o3;
 
-        public SlowPathEvent3(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3) {
+        SlowPathEvent3(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3) {
             super(source, reason, frame);
             this.o1 = o1;
             this.o2 = o2;
@@ -170,7 +170,7 @@
         protected final Object o3;
         protected final Object o4;
 
-        public SlowPathEvent4(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4) {
+        SlowPathEvent4(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4) {
             super(source, reason, frame);
             this.o1 = o1;
             this.o2 = o2;
@@ -193,7 +193,7 @@
         protected final Object o4;
         protected final Object o5;
 
-        public SlowPathEvent5(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4, Object o5) {
+        SlowPathEvent5(SpecializationNode source, String reason, Frame frame, Object o1, Object o2, Object o3, Object o4, Object o5) {
             super(source, reason, frame);
             this.o1 = o1;
             this.o2 = o2;
@@ -213,7 +213,7 @@
 
         protected final Object[] args;
 
-        public SlowPathEventN(SpecializationNode source, String reason, Frame frame, Object... args) {
+        SlowPathEventN(SpecializationNode source, String reason, Frame frame, Object... args) {
             super(source, reason, frame);
             this.args = args;
         }
