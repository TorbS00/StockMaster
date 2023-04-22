# StockMaster Java Code Style

More information about structure, and project code style will be added here. For now, this AI generated Java code style will represent this project.

The StockMaster project follows the standard Java code style guidelines listed below:

## 1. Indentation and Spacing

- Use 4 spaces for indentation.
- Do not use tabs for indentation.
- Put a space after keywords (`if`, `for`, `while`, etc.), before and after operators (`+`, `-`, `=`, etc.), and around parentheses, braces, and brackets.
- Use a space before and after the comment delimiter (`//` or `/* */`).

## 2. Naming Conventions

- Use camelCase for variable and method names.
- Use PascalCase for class names.
- Use SCREAMING_SNAKE_CASE for constants.
- Avoid using single-letter variable names, except for loop counters.
- Choose meaningful and descriptive names that indicate the purpose of the variable, method, or class.

## 3. Braces

- Place opening braces (`{`) on the same line as the statement or declaration.
- Place closing braces (`}`) on a new line, aligned with the statement or declaration that opened the block.
- Use braces `{}` for all control structures (`if`, `for`, `while`, etc.), even for single statements.

## 4. Comments

- Use comments to explain the purpose and functionality of code.
- Write comments in English.
- Use Javadoc comments for documenting classes, interfaces, methods, and fields.
- Avoid unnecessary comments, redundant or outdated comments, and comments that state the obvious.

## 5. Error Handling

- Handle exceptions appropriately, either by catching them and taking appropriate action or by propagating them to the caller.
- Do not catch exceptions without handling them properly or simply logging them.
- Use specific exception types rather than catching generic `Exception` wherever possible.
- Avoid using `Throwable` or `catch (Exception e)`.

## 6. Miscellaneous

- Keep lines of code reasonably short, preferably under 80 characters.
- Avoid unnecessary or redundant code.
- Follow the DRY (Don't Repeat Yourself) principle and avoid code duplication.
- Use meaningful and descriptive commit messages.
- Follow the principle of separation of concerns and keep code modular and maintainable.

By adhering to these Java code style guidelines, we aim to create clean, readable, and maintainable code in the StockMaster project. Thank you for your contribution to the project!
