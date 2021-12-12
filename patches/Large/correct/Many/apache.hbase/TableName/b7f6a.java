diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/TableName.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/TableName.java
index c560a43..5167157 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/TableName.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/TableName.java
@@ -180,10 +180,11 @@
     }
 
     if (qualifierName[start] == '.' || qualifierName[start] == '-') {
-      throw new IllegalArgumentException("Illegal first character <" + qualifierName[0] +
-                                         "> at 0. Namespaces can only start with alphanumeric " +
+      throw new IllegalArgumentException("Illegal first character <" + qualifierName[start] +
+                                         "> at 0. " + (isSnapshot ? "Snapshot" : "User-space table") +
+                                         " qualifiers can only start with 'alphanumeric " +
                                          "characters': i.e. [a-zA-Z_0-9]: " +
-                                         Bytes.toString(qualifierName));
+                                         Bytes.toString(qualifierName, start, end));
     }
     for (int i = start; i < end; i++) {
       if (Character.isLetterOrDigit(qualifierName[i]) ||
@@ -194,7 +195,7 @@
       }
       throw new IllegalArgumentException("Illegal character code:" + qualifierName[i] +
                                          ", <" + (char) qualifierName[i] + "> at " + i +
-                                         ". " + (isSnapshot ? "snapshot" : "User-space table") +
+                                         ". " + (isSnapshot ? "Snapshot" : "User-space table") +
                                          " qualifiers can only contain " +
                                          "'alphanumeric characters': i.e. [a-zA-Z_0-9-.]: " +
                                          Bytes.toString(qualifierName, start, end));
