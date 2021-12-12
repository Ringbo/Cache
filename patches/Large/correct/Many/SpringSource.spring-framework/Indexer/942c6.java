diff --git a/org.springframework.expression/src/main/java/org/springframework/expression/spel/ast/Indexer.java b/org.springframework.expression/src/main/java/org/springframework/expression/spel/ast/Indexer.java
index e821430..31b0261 100644
--- a/org.springframework.expression/src/main/java/org/springframework/expression/spel/ast/Indexer.java
+++ b/org.springframework.expression/src/main/java/org/springframework/expression/spel/ast/Indexer.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2009 the original author or authors.
+ * Copyright 2002-2010 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -32,8 +32,8 @@
 import org.springframework.expression.spel.support.ReflectivePropertyAccessor;
 
 /**
- * An Indexer can index into some proceeding structure to access a particular piece of it. Supported structures are:
- * strings/collections (lists/sets)/arrays
+ * An Indexer can index into some proceeding structure to access a particular piece of it.
+ * Supported structures are: strings/collections (lists/sets)/arrays
  * 
  * @author Andy Clement
  * @since 3.0
@@ -114,7 +114,7 @@
 		if ((targetObject instanceof Collection ) || targetObject.getClass().isArray() || targetObject instanceof String) {
 			int idx = (Integer)state.convertValue(index, TypeDescriptor.valueOf(Integer.class));		
 			if (targetObject.getClass().isArray()) {
-				return new TypedValue(accessArrayElement(targetObject, idx),TypeDescriptor.valueOf(targetObjectTypeDescriptor.getElementType()));
+				return new TypedValue(accessArrayElement(targetObject, idx), targetObjectTypeDescriptor.getElementTypeDescriptor());
 			} else if (targetObject instanceof Collection) {
 				Collection c = (Collection) targetObject;
 				if (idx >= c.size()) {
@@ -125,7 +125,7 @@
 				int pos = 0;
 				for (Object o : c) {
 					if (pos == idx) {
-						return new TypedValue(o,TypeDescriptor.valueOf(targetObjectTypeDescriptor.getElementType()));
+						return new TypedValue(o, targetObjectTypeDescriptor.getElementTypeDescriptor());
 					}
 					pos++;
 				}
@@ -218,7 +218,7 @@
 			}
 			if (targetObject instanceof List) {
 				List list = (List)targetObject;
-				Object possiblyConvertedValue = state.convertValue(newValue,TypeDescriptor.valueOf(targetObjectTypeDescriptor.getElementType()));
+				Object possiblyConvertedValue = state.convertValue(newValue, targetObjectTypeDescriptor.getElementTypeDescriptor());
 				list.set(idx,possiblyConvertedValue);
 				return;
 			}
@@ -278,7 +278,7 @@
 			Object newCollectionElement = null;
 			try {
 				int newElements = index-collection.size();
-				if (elementType == null) {
+				if (elementType == null || elementType == Object.class) {
 					throw new SpelEvaluationException(getStartPosition(), SpelMessage.UNABLE_TO_GROW_COLLECTION_UNKNOWN_ELEMENT_TYPE);	
 				}
 				while (newElements>0) {
