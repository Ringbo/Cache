diff --git a/src/main/java/com/gitblit/utils/JGitUtils.java b/src/main/java/com/gitblit/utils/JGitUtils.java
index 69084ca..356a796 100644
--- a/src/main/java/com/gitblit/utils/JGitUtils.java
+++ b/src/main/java/com/gitblit/utils/JGitUtils.java
@@ -774,7 +774,7 @@
 			}
 		} finally {
 			rw.dispose();
-			tw.release();
+			tw.close();
 		}
 		return content;
 	}
@@ -885,7 +885,7 @@
 		} catch (IOException e) {
 			error(e, repository, "{0} failed to get files for commit {1}", commit.getName());
 		} finally {
-			tw.release();
+			tw.close();
 		}
 		Collections.sort(list);
 		return list;
@@ -942,7 +942,7 @@
 		} catch (IOException e) {
 			error(e, repository, "{0} failed to get files for commit {1}", commit.getName());
 		} finally {
-			tw.release();
+			tw.close();
 		}
 		Collections.sort(list);
 		return list;
@@ -994,7 +994,7 @@
 							.getRawMode(0), tw.getObjectId(0).getName(), commit.getId().getName(),
 							ChangeType.ADD));
 				}
-				tw.release();
+				tw.close();
 			} else {
 				RevCommit parent = rw.parseCommit(commit.getParent(0).getId());
 				DiffStatFormatter df = new DiffStatFormatter(commit.getName());
@@ -1049,7 +1049,7 @@
 			RevCommit start = rw.parseCommit(startRange);
 			RevCommit end = rw.parseCommit(endRange);
 			list.addAll(getFilesInRange(repository, start, end));
-			rw.release();
+			rw.close();
 		} catch (Throwable t) {
 			error(t, repository, "{0} failed to determine files in range {1}..{2}!", startCommit, endCommit);
 		}
@@ -1147,7 +1147,7 @@
 		} catch (IOException e) {
 			error(e, repository, "{0} failed to get documents for commit {1}", commit.getName());
 		} finally {
-			tw.release();
+			tw.close();
 		}
 		Collections.sort(list);
 		return list;
@@ -2044,7 +2044,7 @@
 			error(t, repository, "{0} can't find {1} in commit {2}", path, commit.name());
 		} finally {
 			rw.dispose();
-			tw.release();
+			tw.close();
 		}
 		return commitId;
 	}
@@ -2218,10 +2218,10 @@
 						success = false;
 					}
 				} finally {
-					revWalk.release();
+					revWalk.close();
 				}
 			} finally {
-				odi.release();
+				odi.close();
 			}
 		} catch (Throwable t) {
 			error(t, repository, "Failed to create orphan branch {1} in repository {0}", branchName);
@@ -2412,7 +2412,7 @@
 			LOGGER.error("Failed to determine canMerge", e);
 		} finally {
 			if (revWalk != null) {
-				revWalk.release();
+				revWalk.close();
 			}
 		}
 		return MergeStatus.NOT_MERGEABLE;
@@ -2498,14 +2498,14 @@
 					// return the merge commit id
 					return new MergeResult(MergeStatus.MERGED, mergeCommitId.getName());
 				} finally {
-					odi.release();
+					odi.close();
 				}
 			}
 		} catch (IOException e) {
 			LOGGER.error("Failed to merge", e);
 		} finally {
 			if (revWalk != null) {
-				revWalk.release();
+				revWalk.close();
 			}
 		}
 		return new MergeResult(MergeStatus.FAILED, null);
