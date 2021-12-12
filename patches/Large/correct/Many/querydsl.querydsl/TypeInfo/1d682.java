diff --git a/querydsl-apt/src/main/java/com/mysema/query/apt/util/TypeInfo.java b/querydsl-apt/src/main/java/com/mysema/query/apt/util/TypeInfo.java
index 07369af..e91f5aa 100644
--- a/querydsl-apt/src/main/java/com/mysema/query/apt/util/TypeInfo.java
+++ b/querydsl-apt/src/main/java/com/mysema/query/apt/util/TypeInfo.java
@@ -124,7 +124,8 @@
                 }
 
             } else if (typeName.equals(java.util.Collection.class.getName())
-                    || typeName.equals(java.util.Set.class.getName())) {
+                    || typeName.equals(java.util.Set.class.getName()) 
+                    || typeName.equals(java.util.SortedSet.class.getName())) {
                 TypeInfo valueInfo = new TypeInfo(i.next());
                 fullName = valueInfo.getFullName();
                 packageName = valueInfo.getPackageName();
