diff --git a/examples/boot-api/src/main/java/org/springside/examples/bootapi/api/BookEndpoint.java b/examples/boot-api/src/main/java/org/springside/examples/bootapi/api/BookEndpoint.java
index 0b94e35..af3ad8d 100644
--- a/examples/boot-api/src/main/java/org/springside/examples/bootapi/api/BookEndpoint.java
+++ b/examples/boot-api/src/main/java/org/springside/examples/bootapi/api/BookEndpoint.java
@@ -42,7 +42,7 @@
 	public List<BookDto> listAllBook(Pageable pageable) {
 		Iterable<Book> books = adminService.findAll(pageable);
 
-		return BeanMapper.mapList(books, Book.class,BookDto.class);
+		return BeanMapper.mapList(books, BookDto.class);
 	}
 
 	@RequestMapping(value = "/api/books/{id}", produces = MediaTypes.JSON_UTF_8)
@@ -127,7 +127,7 @@
 		checkToken(token);
 		Account currentUser = accountService.getLoginUser(token);
 		List<Book> books = adminService.listMyBook(currentUser.id, pageable);
-		return BeanMapper.mapList(books, Book.class, BookDto.class);
+		return BeanMapper.mapList(books, BookDto.class);
 	}
 
 	@RequestMapping(value = "/api/myborrowedbook", produces = MediaTypes.JSON_UTF_8)
@@ -136,7 +136,7 @@
 		checkToken(token);
 		Account currentUser = accountService.getLoginUser(token);
 		List<Book> books = borrowService.listMyBorrowedBook(currentUser.id, pageable);
-		return BeanMapper.mapList(books, Book.class, BookDto.class);
+		return BeanMapper.mapList(books, BookDto.class);
 	}
 
 	private void checkToken(String token) {
