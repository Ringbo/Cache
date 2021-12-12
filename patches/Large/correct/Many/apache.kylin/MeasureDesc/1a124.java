diff --git a/core-metadata/src/main/java/org/apache/kylin/metadata/model/MeasureDesc.java b/core-metadata/src/main/java/org/apache/kylin/metadata/model/MeasureDesc.java
index 7abfad1..dcf6350 100644
--- a/core-metadata/src/main/java/org/apache/kylin/metadata/model/MeasureDesc.java
+++ b/core-metadata/src/main/java/org/apache/kylin/metadata/model/MeasureDesc.java
@@ -63,7 +63,7 @@
 
     @Override
     public int hashCode() {
-        return Objects.hash(function, dependentMeasureRef.toLowerCase());
+        return Objects.hash(function, dependentMeasureRef);
     }
 
     @Override
@@ -84,7 +84,7 @@
         if (dependentMeasureRef == null && that.getDependentMeasureRef() == null)
             return true;
 
-        return dependentMeasureRef.equalsIgnoreCase(that.getDependentMeasureRef());
+        return dependentMeasureRef.equals(that.getDependentMeasureRef());
     }
 
     @Override
