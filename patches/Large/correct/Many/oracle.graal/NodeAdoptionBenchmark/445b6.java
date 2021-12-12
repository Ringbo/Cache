diff --git a/truffle/com.oracle.truffle.api.benchmark/src/com/oracle/truffle/api/benchmark/NodeAdoptionBenchmark.java b/truffle/com.oracle.truffle.api.benchmark/src/com/oracle/truffle/api/benchmark/NodeAdoptionBenchmark.java
index 081fc22..360f4ca 100644
--- a/truffle/com.oracle.truffle.api.benchmark/src/com/oracle/truffle/api/benchmark/NodeAdoptionBenchmark.java
+++ b/truffle/com.oracle.truffle.api.benchmark/src/com/oracle/truffle/api/benchmark/NodeAdoptionBenchmark.java
@@ -1,3 +1,25 @@
+/*
+ * Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.
+ * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
+ *
+ * This code is free software; you can redistribute it and/or modify it
+ * under the terms of the GNU General Public License version 2 only, as
+ * published by the Free Software Foundation.
+ *
+ * This code is distributed in the hope that it will be useful, but WITHOUT
+ * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
+ * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
+ * version 2 for more details (a copy is included in the LICENSE file that
+ * accompanied this code).
+ *
+ * You should have received a copy of the GNU General Public License version
+ * 2 along with this work; if not, write to the Free Software Foundation,
+ * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
+ *
+ * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
+ * or visit www.oracle.com if you need additional information or have any
+ * questions.
+ */
 package com.oracle.truffle.api.benchmark;
 
 import org.openjdk.jmh.annotations.Benchmark;
@@ -90,7 +112,7 @@
 
         @Children final Expression[] children;
 
-        public Block(Expression[] children) {
+        Block(Expression[] children) {
             this.children = children;
         }
 
@@ -105,10 +127,10 @@
         @Child private Expression child0;
         @Child private Expression child1;
 
-        public Binary() {
+        Binary() {
         }
 
-        public Binary(Expression child0, Expression child1) {
+        Binary(Expression child0, Expression child1) {
             this.child0 = child0;
             this.child1 = child1;
         }
@@ -127,7 +149,7 @@
 
         @Child private Expression child0;
 
-        public Unary(Expression child0) {
+        Unary(Expression child0) {
             this.child0 = child0;
         }
 
