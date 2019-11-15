# RoundedProgressBar

RoundedProgressBar is a native progress bar made in Kotlin which is renderized natively in Android devices.

![rounded progress bar](https://docs.google.com/uc?id=1srN5phBDodE-1YJ9p3Iy8EtEiFDNHyKU)

# Features

- Custom colors for background and foreground
- Custom size for background and foreground
- Set a different radius
- Light, there is no dependencies there

### Installation

```sh
$ npm ... //TODO
```

### Usage

```javascript
import RoundedProgressBar from 'src/components/RoundedProgressBar';

render() {
    return <RoundedProgressBar
                    radius={100}
                    percentage={0.75}
                    progressBarColor={"#ff77CC"}
                    backgroundWidth={30}
                    progressWidth={30}/>
  }
```

### Props

| Name               | Description                                                              |
| ------------------ | ------------------------------------------------------------------------ |
| percentage         | Decimal value used for displaying the progress, for example, 0.5 or 0.25 |
| radius             | Size of the radius of the circle                                         |
| progressWidth      | The width of the progress bar                                            |
| backgroundWidth    | The width of the background of the progress bar                          |
| progressBarColor   | The color of the progress bar                                            |
| backgroundBarColor | The background color of the border                                       |
| backgroundColor    | The inner background color of the component                              |

### Author

Domestika

### License

MIT

### Keywords

react native progress progressbar circle indicator

**Happy hacking!**
