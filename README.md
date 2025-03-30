# Environment

1. Java 21
1. sbt 1.10.x
1. Node.js v23.10.0


# Development Procedure

1. Start `vite` HMR (Hot Module Replacement) in `js` directory

       npm install
       npm run dev

1. Launch `sbt` in the project root directory

## sbt commands

1. Compile, then continuously recompile as the source files change

       ~fastLinkJS

    1. The output will be picked up by `vite`


# Release

1. In `js` directory

       npm run build

## Test the release

       npm run preview
