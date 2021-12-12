diff --git a/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberPlus.java b/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberPlus.java
index 343eedf..0aeeb49 100644
--- a/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberPlus.java
+++ b/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberPlus.java
@@ -115,7 +115,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return (Double) receiver + (Double) arg;
                 }
             }
@@ -132,7 +132,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return (Double) receiver + ((Float) arg).doubleValue();
                 }
             }
@@ -149,7 +149,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return (Double) receiver + ((Long) arg).doubleValue();
                 }
             }
@@ -166,7 +166,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return (Double) receiver + (Integer) arg;
                 }
             }
@@ -183,7 +183,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Float) receiver).doubleValue() + (Double) arg;
                 }
             }
@@ -200,7 +200,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Float) receiver).doubleValue() + ((Float) arg).doubleValue();
                 }
             }
@@ -217,7 +217,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Float) receiver).doubleValue() + ((Long) arg).doubleValue();
                 }
             }
@@ -234,7 +234,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Float) receiver).doubleValue() + ((Integer) arg).doubleValue();
                 }
             }
@@ -251,7 +251,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Long) receiver).doubleValue() + (Double) arg;
                 }
             }
@@ -268,7 +268,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Long) receiver).doubleValue() + ((Float) arg).doubleValue();
                 }
             }
@@ -285,7 +285,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return (Long) receiver + (Long) arg;
                 }
             }
@@ -302,7 +302,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return (Long) receiver + ((Integer) arg).longValue();
                 }
             }
@@ -319,7 +319,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Integer) receiver).doubleValue() + (Double) arg;
                 }
             }
@@ -336,7 +336,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Integer) receiver).doubleValue() + ((Float) arg).doubleValue();
                 }
             }
@@ -353,7 +353,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return ((Integer) receiver).longValue() + (Long) arg;
                 }
             }
@@ -370,7 +370,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return (Integer) receiver + (Integer) arg;
                 }
             }
