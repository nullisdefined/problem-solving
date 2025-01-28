function solution(video_len, pos, op_start, op_end, commands) {
    const toSecond = (timeStr) => {
        const [min, sec] = timeStr.split(":").map(Number);
        return min * 60 + sec;
    }
    
    const toTimeStr = (s) => {
        const min = Math.floor(s / 60);
        const sec = s % 60;
        return `${String(min).padStart(2, '0')}:${String(sec).padStart(2, '0')}`;
    }
    
    // a = toSecond(video_len);
    // console.log(toSecond(video_len));
    // console.log(toTimeStr(a));
    
    let sec = toSecond(pos);
    const opStartSec = toSecond(op_start);
    const opEndSec = toSecond(op_end);
    const videoSec = toSecond(video_len);
    
    for (command of commands) {
        // 오프닝 이동
        if (sec >= opStartSec && sec <= opEndSec) {
            sec = opEndSec;
        }
        if (command === 'next') {
            sec = Math.min(sec + 10, videoSec);
        }
        if (command === 'prev') {
            sec = Math.max(sec - 10, 0);
        }
    }
    // 오프닝 이동
        if (sec >= opStartSec && sec <= opEndSec) {
            sec = opEndSec;
        }
    
    return toTimeStr(sec);
}