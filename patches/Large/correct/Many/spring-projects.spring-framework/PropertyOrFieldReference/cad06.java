diff --git a/spring-expression/src/main/java/org/springframework/expression/spel/ast/PropertyOrFieldReference.java b/spring-expression/src/main/java/org/springframework/expression/spel/ast/PropertyOrFieldReference.java
index faae9ab..89b9081 100644
--- a/spring-expression/src/main/java/org/springframework/expression/spel/ast/PropertyOrFieldReference.java
+++ b/spring-expression/src/main/java/org/springframework/expression/spel/ast/PropertyOrFieldReference.java
@@ -187,9 +187,9 @@
 			try {
 				return accessorToUse.read(evalContext, contextObject.getValue(), name);
 			}
-			catch (AccessException ex) {
-				// this is OK - it may have gone stale due to a class change,
-				// let's try to get a new one and call it before giving up
+			catch (Exception ex) {
+				// This is OK - it may have gone stale due to a class change,
+				// let's try to get a new one and call it before giving up...
 				this.cachedReadAccessor = null;
 			}
 		}
@@ -212,7 +212,7 @@
 					}
 				}
 			}
-			catch (AccessException ex) {
+			catch (Exception ex) {
 				throw new SpelEvaluationException(ex, SpelMessage.EXCEPTION_DURING_PROPERTY_READ, name, ex.getMessage());
 			}
 		}
@@ -238,9 +238,9 @@
 				accessorToUse.write(evalContext, contextObject.getValue(), name, newValue);
 				return;
 			}
-			catch (AccessException ex) {
-				// this is OK - it may have gone stale due to a class change,
-				// let's try to get a new one and call it before giving up
+			catch (Exception ex) {
+				// This is OK - it may have gone stale due to a class change,
+				// let's try to get a new one and call it before giving up...
 				this.cachedWriteAccessor = null;
 			}
 		}
@@ -291,7 +291,6 @@
 		return false;
 	}
 
-	// TODO when there is more time, remove this and use the version in AstUtils
 	/**
 	 * Determines the set of property resolvers that should be used to try and access a property
 	 * on the specified target type. The resolvers are considered to be in an ordered list,
