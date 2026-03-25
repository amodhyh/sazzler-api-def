# Sazzler API Definition

## Overview
Contains shared DTOs, interfaces, and contracts used by other microservices. Promotes code reuse and consistency.

## Features
- DTOs for product, order, user, etc.
- Service interfaces
- Shared enums and constants

## Usage
- Add as a dependency in other microservices
- Import DTOs/interfaces for request/response models

## Build
```bash
./gradlew build
```

## Troubleshooting
- Ensure correct package imports in consuming services
- Rebuild after changes to DTOs/interfaces

