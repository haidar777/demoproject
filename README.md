# SAP Hybris Demo InTheBox

## Setup
Clone this repo, then make a symlink of the repo folders to your hybris folders

#### Linux

```bash
ln -s $(pwd)/custom $HYBRIS_HOME_DIR/hybris/bin/custom
ln -s $(pwd)/config $HYBRIS_HOME_DIR/hybris/config
```

#### Windows

```bash
mklink /D "$HYBRIS_HOME_DIR\hybris\bin\custom" "$REPO\custom"
mklink /D "$HYBRIS_HOME_DIR\hybris\config" "$REPO\config"
```

## Initialize

Run both ant all and initialize on platform directory of the hybris project

#### Linux

```bash
cd $HYBRIS_HOME_DIR/hybris/bin/platform
. ./setantenv.sh
ant all
ant initialize
```

#### Windows

```bash
cd $HYBRIS_HOME_DIR/hybris/bin/platform
setantenv.bat
ant all initialize
```

## Run

To run the project, execute the following command lines.

#### Linux

```bash
cd $HYBRIS_HOME_DIR/hybris/bin/platform
./hybrisserver.sh debug
```

#### Windows

```bash
cd $HYBRIS_HOME_DIR/hybris/bin/platform
hybrisserver.bat debug
```
