diff --git a/spring-core/src/main/java/org/springframework/core/CollectionFactory.java b/spring-core/src/main/java/org/springframework/core/CollectionFactory.java
index f9354a8..047989b 100644
--- a/spring-core/src/main/java/org/springframework/core/CollectionFactory.java
+++ b/spring-core/src/main/java/org/springframework/core/CollectionFactory.java
@@ -255,7 +255,8 @@
 				return (Collection) collectionType.newInstance();
 			}
 			catch (Exception ex) {
-				throw new IllegalArgumentException("Could not instantiate Collection type: " + collectionType.getName());
+				throw new IllegalArgumentException("Could not instantiate Collection type: " +
+						collectionType.getName(), ex);
 			}
 		}
 	}
@@ -322,7 +323,8 @@
 				return (Map) mapType.newInstance();
 			}
 			catch (Exception ex) {
-				throw new IllegalArgumentException("Could not instantiate Map type: " + mapType.getName());
+				throw new IllegalArgumentException("Could not instantiate Map type: " +
+						mapType.getName(), ex);
 			}
 		}
 	}
