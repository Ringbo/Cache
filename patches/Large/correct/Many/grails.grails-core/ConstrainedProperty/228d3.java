diff --git a/src/commons/org/codehaus/groovy/grails/validation/ConstrainedProperty.java b/src/commons/org/codehaus/groovy/grails/validation/ConstrainedProperty.java
index b139052..f956b8d 100644
--- a/src/commons/org/codehaus/groovy/grails/validation/ConstrainedProperty.java
+++ b/src/commons/org/codehaus/groovy/grails/validation/ConstrainedProperty.java
@@ -505,10 +505,10 @@
                 if(propertyValue == null) {
                     super.rejectValue(errors,RANGE_CONSTRAINT + INVALID_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_RANGE_MESSAGE, args ));
                 }
-                else if(range.getFrom().compareTo( propertyValue ) == -1) {
+                else if(range.getFrom().compareTo( propertyValue ) == 1) {
                     super.rejectValue(errors,SIZE_CONSTRAINT + TOOSMALL_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_SIZE_MESSAGE, args ));
                 }
-                else if(range.getFrom().compareTo(propertyValue) == 1) {
+                else if(range.getTo().compareTo(propertyValue) == -1) {
                     super.rejectValue(errors,SIZE_CONSTRAINT + TOOBIG_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_SIZE_MESSAGE, args ));
                 }
 
@@ -775,10 +775,10 @@
                 Integer length = new Integer(Array.getLength( propertyValue ));
                 if(!range.contains(length)) {
 
-                    if(range.getFrom().compareTo( length ) == -1) {
+                    if(range.getFrom().compareTo( length ) == 1) {
                         super.rejectValue(errors,LENGTH_CONSTRAINT + TOOSHORT_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_LENGTH_MESSAGE, args ));
                     }
-                    else if(range.getFrom().compareTo(length) == 1) {
+                    else if(range.getTo().compareTo(length) == -1) {
                         super.rejectValue(errors,LENGTH_CONSTRAINT + TOOLONG_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_LENGTH_MESSAGE, args ));
                     }
                     return;
@@ -787,29 +787,29 @@
             if(propertyValue instanceof Collection) {
                 Integer collectionSize = new Integer(((Collection)propertyValue).size());
                 if(!range.contains( collectionSize )) {
-                    if(range.getFrom().compareTo( collectionSize ) == -1) {
+                    if(range.getFrom().compareTo( collectionSize ) == 1) {
                         super.rejectValue(errors,SIZE_CONSTRAINT + TOOSMALL_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_SIZE_MESSAGE, args ));
                     }
-                    else if(range.getFrom().compareTo(collectionSize) == 1) {
+                    else if(range.getTo().compareTo(collectionSize) == -1) {
                         super.rejectValue(errors,SIZE_CONSTRAINT + TOOBIG_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_SIZE_MESSAGE, args ));
                     }
                 }
             }
             else if(propertyValue instanceof Number) {
-                if(range.getFrom().compareTo( propertyValue ) == -1) {
+                if(range.getFrom().compareTo( propertyValue ) == 1) {
                     super.rejectValue(errors,SIZE_CONSTRAINT + TOOSMALL_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_SIZE_MESSAGE, args ));
                 }
-                else if(range.getFrom().compareTo(propertyValue) == 1) {
+                else if(range.getTo().compareTo(propertyValue) == -1) {
                     super.rejectValue(errors,SIZE_CONSTRAINT + TOOBIG_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_SIZE_MESSAGE, args ));
                 }
             }
             else if(propertyValue instanceof String) {
                 Integer stringLength =  new Integer(((String)propertyValue ).length());
                 if(!range.contains(stringLength)) {
-                    if(range.getFrom().compareTo( stringLength ) == -1) {
+                    if(range.getFrom().compareTo( stringLength ) == 1) {
                         super.rejectValue(errors,LENGTH_CONSTRAINT + TOOSHORT_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_LENGTH_MESSAGE, args ));
                     }
-                    else if(range.getFrom().compareTo(stringLength) == 1) {
+                    else if(range.getTo().compareTo(stringLength) == -1) {
                         super.rejectValue(errors,LENGTH_CONSTRAINT + TOOLONG_SUFFIX,args,MessageFormat.format( DEFAULT_INVALID_LENGTH_MESSAGE, args ));
                     }
                 }
