# RoundedProgressBar

RoundedProgressBar is a native progress bar made in Kotlin and Swift which is renderized natively for Android and iOS devices.

![rounded progress bar](https://docs.google.com/uc?id=1srN5phBDodE-1YJ9p3Iy8EtEiFDNHyKU)

# Features

- Custom colors for background and foreground
- Custom size for background and foreground
- Set a different radius
- Light, there is no dependencies there

## Installation

- `$ yarn add react-native-rounded-progress-bar`
- `cd ios/ && pod install`

### Usage

```javascript
import RoundedProgressBar from "react-native-rounded-progress-bar";

<RoundedProgressBar
  percent={0.75}
  borderWidth={4}
  size={40}
  color="#F02D00"
  bgColor="#DF8BD1"
  backgroundWidth={30}
  progressWidth={30}
  radius={100}
>
  <Text>Loading...</Text>
</RoundedProgressBar>;
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
