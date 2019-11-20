import React from 'react';
import { requireNativeComponent, Platform } from 'react-native';
import ProgressCircle from 'react-native-progress-circle';

const RPBComponent = Platform.select({
  // sorry iOS :(
  ios: ProgressCircle,

  // name from overriden `getName` function
  android: requireNativeComponent('RoundedProgressBar')
});

export default class RoundedProgressBar extends React.Component {

  formatProps(props) {
    return Platform.OS === 'android' ? 
    {
        ...props,
        percent: props.percent / 100,
        borderWidth: props.borderWidth + 3,
        backgroundWidth: props.backgroundWidth + 3,
        radius: null
    } : 
    props
  }

  render() {
    const { size } = this.props;
    return (
      <RPBComponent 
        {...this.formatProps(this.props)}
        style={{
          width: size,
          height: size,
          display: "flex",
          justifyContent: 'center',
          alignItems: 'center' 
        }}
      />
    );
  }
}
