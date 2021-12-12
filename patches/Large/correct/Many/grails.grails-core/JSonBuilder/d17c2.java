diff --git a/src/commons/grails/util/JSonBuilder.java b/src/commons/grails/util/JSonBuilder.java
index cc4d676..cad72f7 100644
--- a/src/commons/grails/util/JSonBuilder.java
+++ b/src/commons/grails/util/JSonBuilder.java
@@ -100,7 +100,7 @@
 				stack.push(ARRAY);
 			}
 		} catch (JSONException e) {
-			throw new IllegalArgumentException( JSON_BUILDER + "invalid element" ,e );
+			throw new IllegalArgumentException( JSON_BUILDER + "invalid element" );
 		}
 		
 		return Integer.valueOf(retVal);
@@ -117,7 +117,7 @@
 			writer.endObject();
 			return null;			
 		} catch (JSONException e) {
-			throw new IllegalArgumentException( JSON_BUILDER + "invalid element" ,e );
+			throw new IllegalArgumentException( JSON_BUILDER + "invalid element" );
 		}
 	}
 
@@ -143,7 +143,7 @@
 			}
 			return retVal != 0 ? Integer.valueOf(retVal) : null;			
 		} catch (JSONException e) {
-			throw new IllegalArgumentException( JSON_BUILDER + "invalid element" ,e );
+			throw new IllegalArgumentException( JSON_BUILDER + "invalid element");
 		}
 	}
 
@@ -173,7 +173,7 @@
     			}
     		}
     		catch (JSONException e) {
-    			throw new IllegalArgumentException( JSON_BUILDER + "invalid element on the stack" ,e );
+    			throw new IllegalArgumentException( JSON_BUILDER + "invalid element on the stack" );
     		}
     	}
     }
